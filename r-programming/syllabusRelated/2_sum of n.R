#sum of 1 to n

n <- as.integer(readline(prompt="Enter a number: "))
sum <- 0
for(i in c(1:n)){
  sum <- sum + i
}

cat("Sum of 1 to",n,"is: ",sum)