SELECT movie.title, max(Rating.stars) - min(Rating.stars) AS rating_spread
FROM movie 
JOIN Movie.Rating ON Movie.movie.mID = Movie.Rating.mID
group by title
order by rating_spread desc, title;
-- For each movie, return the title and the ‘rating spread’, that is, the difference between highest and lowest ratings given to that movie. 
-- Sort by rating spread from highest to lowest, then by movie title.