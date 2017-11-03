import zeep

wsdl = 'http://13.115.108.102/ECEItemWS?wsdl'
# wsdl = "http://13.115.201.228/ECEItemWS?wsdl"
client = zeep.Client(wsdl=wsdl)

# print (client.service.add(3,7))

# result = client.service.getLastOrder()
# result = client.service.getOrder(2)
# result = client.service.getExamineInfo(5)
result = client.service.getTakeInfo(5)
# result = client.service.hello("chatchai")
# print (result)
if result != None:
    f =  open("D:\Downloads\getTakeInfo.xml", "wb")
    f.write(result)
    f.close()
    print("success")
else:
    print ("no data")
# print (dom1)

# result = client.service.add(i, j)  # 10 + 2 = 12
# print("{} + {} = {}".format(i, j, result))
#
# result = client.service.subtraction(i, j)  # 10 - 2 = 8
# print("{} - {} = {}".format(i, j, result))
#
# result = client.service.multiply(i, j)  # 10 * 2 = 20
# print("{} * {} = {}".format(i, j, result))
#
# result = client.service.divide(i, j)  # 10 / 2 = 5
# print("{} / {} = {}".format(i, j, result))
