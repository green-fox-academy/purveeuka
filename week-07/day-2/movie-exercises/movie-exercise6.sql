SELECT name, title
FROM Rating AS A 
JOIN Rating AS B ON (A.rID = B.rID AND A.mID = B.mID AND A.ratingDate > B.ratingDate AND A.stars > B.stars)
JOIN Reviewer ON A.rID = Reviewer.rID
JOIN Movie ON A.mID = Movie.mID;
-- For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time, 
--  return the reviewer’s name and the title of the movie.