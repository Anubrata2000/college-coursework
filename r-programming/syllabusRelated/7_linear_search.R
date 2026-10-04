#linear search

cat("Enter datas(space seperated) press enter 2 times to stop: ")
vtr <- scan(what = numeric())

n <- as.integer(readline(prompt = "Enter num you want to search: "))
flag <- 0

for(i in 1:length(vtr)){
  if(n == vtr[i]){
    flag <- 1
    break
  }
}

if(flag == 1){
  cat("Value found at index ",i)
}else{
  print("Value not found")
}