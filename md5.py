
import hashlib
print("Enter the msg:")
p = input() 
result = hashlib.md5(p.encode()).hexdigest()  
print("The equivalent hexadecimal value:",end="")
print(result)
result2 = hashlib.sha256(p.encode()).hexdigest()  
print("The equivalent hexadecimal value:",end="")
print(result2)
result1 = hashlib.sha384(p.encode()).hexdigest() 
print("The equivalent hexadecimal value:",end="")
print(result1)
