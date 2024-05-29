# aws-flink.g8

This is a [Giter8](https://www.foundweekends.org/giter8/) template for creating a new[ Managed Service for Flink](https://docs.aws.amazon.com/managed-flink/latest/java/how-it-works.html) project.

## Requirements
- Java 11
- sbt 1.10.0
- Scala 3.3.0
- Apache Flink 1.18.1

## Usage
```bash
sbt new sercandogan/aws-flink.g8
```


# TODOs:
- [ ] Adds boiler plate code for a Flink application that reads from a Kinesis stream and writes to DynamoDB.
- [ ] Resolve dependencies in order to dynamically create template for different versions of scala and flink. 