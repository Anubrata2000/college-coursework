multable<-function(a)
{
  for(i in 1:10)
  {
    cat(a,"*",i,"=",a*i,"\n")
  }
}
r1=readline(prompt="Enter 1st range")
r=as.integer(r1)
r2=readline(prompt="Enter 2nd range")
s=as.integer(r2)
for (i in r:s)
{
  multable(i)
  cat("\n\n\n")
}
