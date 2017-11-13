require 'savon'

client = Savon.client(wsdl: "https://www.yenaura.com/ECEItemWS?wsdl", headers: { "Username" => "happysoap", "Password" => "1234"})

## display hello chatchai
response = client.call(:hello, message: {name: "chatchai"})
puts response.to_hash[:hello_response][:return]

## display order 5
response = client.call(:get_order, message: {orderNumber: "5"})
result = response.to_hash[:get_order_response][:return]
puts result
# File.write('D:\Downloads\getOrder5.xml', result)

## display examine info order 5
response = client.call(:get_examine_info, message: {orderNumber: "5"})
result = response.to_hash[:get_examine_info_response][:return]
puts result
# File.write('D:\Downloads\getExamineInfo.xml', result)

## display last order
response = client.call(:get_last_order)
result = response.to_hash[:get_last_order_response][:return]
puts result
# File.write('D:\Downloads\getLastOrder.xml', result)

## display take info order 5
response = client.call(:get_take_info, message: {orderNumber: "5"})
result = response.to_hash[:get_take_info_response][:return]
puts result
# File.write('D:\Downloads\getTakeInfo.xml', result)
