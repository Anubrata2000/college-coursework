reign(shivaji,1826,1900).
reign(akbar,1600,1680).
reign(humayun,1427,1257).
reign(alexander,1755,1845).
reign(aurangzeb,1890,1950).
ruler(X,Y):-reign(X,A,B),
            Y>=A,
            Y=<B.size().
