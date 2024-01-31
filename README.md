Cloudwatch
-----------

3 ways to implement:

1) Localwatch
2) Ec2 agent: when app in deployed in ec2, we need install agent.
3) Serverless: Lambda, Fargate
<br>
1) Localwatch (Push Logs from local to aws cloudwatch)
--------------------------------------------------------
step 1 : create Log groups & Log streams in aws cloudwatch.
Log groups - create Log groups for individual application. Example: my-first-service
Log streams - create Log streams for for the application. Example: my-stream

step 2 : To access aws service from local we need access key and secret key.
-> Go to IAM -> Users -> Security Credentials -> Create access key (Copy access key & secret key)

Step 3 : Add maven dependency for cloudwatch in Spring boot application
		</dependency>
			<dependency>
			<groupId>com.amazonaws</groupId>
			<artifactId>aws-java-sdk-logs</artifactId>
			<version>1.12.647</version>
		</dependency>


step 4 : update accessKey and secretKey in Configuration class and application.properties. <br>
step 5 : update you logGroupName, logStreamName in service class.

step 6 : Check the code

