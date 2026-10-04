r <- as.integer(readline(prompt = "Enter row: "))
c <- as.integer(readline(prompt = "Enter col: "))

print("Enter your 1st matrix")
cat("Enter datas(space seperated) press enter 2 times to stop\n")
cat("NOTE(ROW WISE in one line): ")
vtr1 <- scan(what = numeric())

print("Enter your 2nd matrix")
cat("Enter datas(space seperated) press enter 2 times to stop\n")
cat("NOTE(ROW WISE in one line): ")
vtr2 <- scan(what = numeric())

mat1 <- matrix(vtr1, nrow = r, ncol = c, byrow = TRUE)
mat2 <- matrix(vtr2, nrow = r, ncol = c, byrow = TRUE)

m_add <- mat1 + mat2
m_sub <- mat1 - mat2
m_mul <- mat1 %*% mat2

print("Addition of two matrix is")
print(m_add)
cat("\n\n")

print("Subtraction of two matrix is")
print(m_sub)
cat("\n\n")

print("Multiplication of two matrix is")
print(m_mul)
cat("\n\n")