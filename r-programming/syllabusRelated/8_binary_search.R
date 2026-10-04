# binary search

cat("Enter datas ascending order(space seperated) press enter 2 times to stop: ")
vtr <- scan(what = numeric())

n <- as.integer(readline(prompt = "Enter num you want to search: "))
flag <- 0
ub <- length(vtr)
lb <- 1
m <- NULL
while(ub >= lb){
  m <- (ub + lb) %/% 2
  if(n == vtr[m]){
    flag <- 1
    break
  }
  if(n > vtr[m]){
    lb <- m + 1
  }else{
    ub <- m - 1
  }
}

if(flag == 1){
  cat("Value found at index ", m)
}else{
  print("Value not found")
}