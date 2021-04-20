SELECT DISTINCT title FROM Movie LEFT JOIN Rating ON Movie.mID = Rating.mID WHERE Rating.stars IS NULL;
-- Find the titles of all movies that have no ratings.