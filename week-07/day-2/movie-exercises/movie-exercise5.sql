SELECT name, title, stars, ratingDate FROM Rating 
JOIN Reviewer ON Rating.rID = Reviewer.rID
JOIN Movie ON Rating.mID = Movie.mID
ORDER BY name, title, stars;

-- Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. 
-- Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars.