```html

2023-10-22T10:29:09.619+02:00  INFO 9199 --- [nio-9010-exec-3] c.e.message.function.MessageFunctions    : sending email with the details: AccountMessageDto[accountNumber=12345, name=santanu, email=cushantanu@gmail.com, mobileNumber=1234567890]
2023-10-22T10:29:09.620+02:00  INFO 9199 --- [nio-9010-exec-3] c.e.message.function.MessageFunctions    : sending sms with the details: AccountMessageDto[accountNumber=12345, name=santanu, email=cushantanu@gmail.com, mobileNumber=1234567890]


{
"accountNumber":"12345",
"name":"David",
"email": "abc@gmail.com",
"mobileNumber": "1234567890"
}

POST: http://localhost:9010/email
POST: http://localhost:9010/sms
POST: http://localhost:9010/emailsms
```