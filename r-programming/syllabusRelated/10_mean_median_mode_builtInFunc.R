# mean median mode (without built in function)

vtr <- c(20,20,20,20,20,21,21,21,22,22,22,22,23,23,23)

# ----- a median age under 22 -----
medvtr22 <- NULL
for(i in vtr){
  if(i < 22){
    medvtr22 <- c(medvtr22, i)
  }
}
cat("Median age of students under age 22: ", median(medvtr22),"\n\n")

# ----- b median age of all students -----
cat("Median age of all students: ", median(vtr),"\n")

# ----- c mean age of all students -----
cat("Mean age of all students: ", mean(vtr),"\n")

# ----- d modal age of all students -----
getmode <- function(v) {
  uniqv <- unique(v)
  uniqv[which.max(tabulate(match(v, uniqv)))]
}
cat("Modal age of all students: ", getmode(vtr),"\n")

# ----- e new mean, median mode after 2 new students of age 23 -----
vtr <- c(vtr, 23, 23)
cat("\nAfter adding 2 students of age 23\n")
cat("New Mean: ", mean(vtr),"\n")
cat("New Median: ", median(vtr),"\n")
cat("New Mode: ", getmode(vtr),"\n")