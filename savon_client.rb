require 'savon'
# client = Savon.client(wsdl: "http://localhost:8080/CalculatorWS/CalculatorWS?wsdl")
# client = Savon.client(wsdl: "http://localhost:8084/secure/secure?wsdl")
# client = Savon.client(wsdl: "http://www.yenaura.com/ECEItemWS?wsdl")
# client = Savon.client(wsdl: "http://13.115.108.102/ECEItemWS?wsdl")
client = Savon.client(wsdl: "http://localhost:8080/testauthen/testauthen?wsdl", headers: { "Username" => "happysoap", "Password" => "1234"})


message = {name: "chatchai" , Username: "happysoap", Password: "1234"}
response = client.call(:hello,message: message)
# puts response
puts response.to_hash[:hello_response][:return]
# i = 10
# j = 2
# message = {i: i, j: j}

# response = client.call(:add, message: message).to_hash[:add_response][:return]
# print i , " + " , j , " = " , response  # 10 + 2 = 12
# puts ""
#
# response = client.call(:subtraction, message: message).to_hash[:subtraction_response][:return]
# print i , " - " , j , " = " , response  # 10 - 2 = 8
# puts ""
#
# response = client.call(:multiply, message: message).to_hash[:multiply_response][:return]
# print i , " * " , j , " = " , response  # 10 * 2 = 20
# puts ""
#
# response = client.call(:divide, message: message).to_hash[:divide_response][:return]
# print i , " / " , j , " = " , response  # 10 / 2 = 5
# puts ""
