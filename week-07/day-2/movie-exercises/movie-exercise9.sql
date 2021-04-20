SELECT AVG(older.avg) - AVG(newer.avg)
FROM ( SELECT AVG(stars) AS avg
FROM Movie.MOVIE INNER JOIN Movie.Rating USING(mID)
WHERE year < 1980
GROUP BY mID ) AS older, ( 
SELECT AVG(stars) AS avg
FROM Movie.MOVIE INNER JOIN Movie.Rating USING(mID)
WHERE year > 1980
GROUP BY mID ) AS newer;

-- Find the difference between the average rating of movies released before 1980 and the average rating of movies released after 1980. 
-- (Make sure to calculate the average rating for each movie, then the average of those averages for movies before 1980 and movies after. 
-- Don’t just calculate the overall average rating before and after 1980.)