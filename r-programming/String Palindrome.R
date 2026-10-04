str <- as.character(readline(prompt = "Enter a string: "))
L <- nchar(str)

rev <- substr(str, L,L)

if(L > 1){
  for (i in (L-1):1) {
    rev <- paste(rev, substr(str, i, i), sep="")
  }
}

if( str == rev){
  print("String is palindrome")
}else{
  print("String not palindrome")
}