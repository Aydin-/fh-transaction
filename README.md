---------------------------------
Example usage
---------------------------------
### curl testjwtclientid:XY7kmzoNzl100@localhost:8080/oauth/token -d grant_type=password -d username=admin -d password=jwtpass

## response
{"access_token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTUyOTUwMTg5LCJhdXRob3JpdGllcyI6WyJBRE1JTl9VU0VSIl0sImp0aSI6IjljOWZjOWY4LTRjNzItNDdmYi1iOTYwLWIxZDcwNWQ4OTMxNyIsImNsaWVudF9pZCI6InRlc3Rqd3RjbGllbnRpZCJ9.Pcn4D6kmhtcbxypWNtQCAMsGYOGsvijRCxKVydQ8Jk0","token_type":"bearer","expires_in":43199,"scope":"read write","jti":"9c9fc9f8-4c72-47fb-b960-b1d705d89317"}%

### curl  http://localhost:8080/api/transactions -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTUyOTUwMTg5LCJhdXRob3JpdGllcyI6WyJBRE1JTl9VU0VSIl0sImp0aSI6IjljOWZjOWY4LTRjNzItNDdmYi1iOTYwLWIxZDcwNWQ4OTMxNyIsImNsaWVudF9pZCI6InRlc3Rqd3RjbGllbnRpZCJ9.Pcn4D6kmhtcbxypWNtQCAMsGYOGsvijRCxKVydQ8Jk0"

## Use Heroku instance
### curl testjwtclientid:XY7kmzoNzl100@fh-transaction.herokuapp.com/oauth/token -d grant_type=password -d username=admin -d password=jwtpass

### curl  http://fh-transaction.herokuapp.com/api/transactions -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTUzMDM2MzkyLCJhdXRob3JpdGllcyI6WyJBRE1JTl9VU0VSIl0sImp0aSI6IjE5ZWYyNDIxLTdmY2UtNDhkZC1hNGIxLTE1OTJmYjlhZTE2MiIsImNsaWVudF9pZCI6InRlc3Rqd3RjbGllbnRpZCJ9.N1BAHudP59xwu6hUcEtM9EXkkgA4irdZ5Uuy8sWgJ64"

