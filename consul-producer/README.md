##consul Eureka对比



-- 集群启动：
- consul agent -server -bootstrap -bind=0.0.0.0 -client=IP1 -data-dir=data -ui -node=s1
- consul agent -server -bind=0.0.0.0 -client=IP2 -data-dir=data -ui -node=s2  -join IP1
- consul agent -server -bind=0.0.0.0 -client=IP3 -data-dir=data -ui -node=s3  -join IP1
