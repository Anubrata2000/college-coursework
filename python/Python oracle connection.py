import cx_Oracle
try:
    # Establish connection with Oracle database
    dsn_tns = cx_Oracle.makedsn('localhost', '1521', service_name='XE')
    conn = cx_Oracle.connect(user='ANUBRATA', password='abcd', dsn=dsn_tns)
    print("Connection successful!!")
except cx_Oracle.DatabaseError as e:
    print("Error:",e)
finally:
    conn.close()
    print('connection closed!!')