# mul table for n up to 12

n <- as.integer(readline(prompt="Enter a number: "))
cat("Table of ",n,"\n")
for(i in c(1:12)){
  cat(n," X ",i," = ",(n*i),"\n")
}