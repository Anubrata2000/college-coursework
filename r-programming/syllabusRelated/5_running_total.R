# running total

cat("Enter datas in ascending(space seperated) press enter 2 times to stop: ")
l1 <- as.list(scan(what = numeric()))

cat("Running total of the input list is: ")

sum <- 0
for(i in c(1:length(l1))){
  sum <- sum + l1[[i]]
  cat(sum, " ")
}