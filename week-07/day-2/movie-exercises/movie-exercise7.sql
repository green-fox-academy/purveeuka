SELECT MAX(stars), title FROM Rating
JOIN Movie ON Movie.mID = Rating.mID
GROUP BY title
ORDER BY title;
-- For each movie that has at least one rating, find the highest number of stars that movie received.
--  Return the movie title and number of stars. Sort by movie title.