SELECT DISTINCT year FROM Rating JOIN Movie ON Movie.mID = Rating.mID WHERE stars >  4 OR 5 ORDER BY year;
-- Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.