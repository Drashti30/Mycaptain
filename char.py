name=str(input("ENTER A STRING"))  
# using naive method to get count  
# of each element in string  
all_freq = {} 
  
for i in name: 
    if i in all_freq: 
        all_freq[i] += 1
    else: 
        all_freq[i] = 1
  
# printing result  
print ("Count of all characters is :\n\t\t "
                                        +  str(all_freq)) 
