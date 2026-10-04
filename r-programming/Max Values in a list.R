cat("Enter datas(space seperated) press enter 2 times to stop: ")
l1 <- as.list(scan(what = numeric()))

max1 <- l1[[1]]
for (i in 1:length(l1)) {
  if(max1 < l1[[i]]){
    max1 <- l1[[i]]
  }
}

cat("Max value in list is: ", max1)