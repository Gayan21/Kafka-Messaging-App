# 📬 Kafka Messaging App (Spring Boot + Docker Kafka)

A simple Spring Boot project demonstrating **Kafka producer/consumer** messaging using a **local Kafka broker (Bitnami)**.

---

## 🚀 Features

- ✅ Spring Boot Kafka producer and consumer
- ✅ REST API to send messages
- ✅ Uses Kafka broker running in Docker (Bitnami)
- ✅ Simple String-based messaging
- ✅ Auto topic creation
- ✅ Dockerized Kafka + Zookeeper (single command setup)

---

## 🧱 Technologies

- Java 17+
- Spring Boot 3.x
- Apache Kafka
- Docker (Bitnami Kafka image)

---

## ⚙️ Kafka Setup (One-line Docker Command)

Run this in **PowerShell or CMD**:
## Running Kafka Broker with Docker

```bash
docker run -d --name kafka-server -p 9092:9092 -p 2181:2181 \
  -e KAFKA_CFG_PROCESS_ROLES=broker,controller \
  -e KAFKA_CFG_NODE_ID=1 \
  -e KAFKA_CFG_LISTENERS=PLAINTEXT://:9092,CONTROLLER://:9093 \
  -e KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
  -e KAFKA_CFG_CONTROLLER_QUORUM_VOTERS=1@localhost:9093 \
  -e KAFKA_CFG_LISTENER_SECURITY_PROTOCOL_MAP=CONTROLLER:PLAINTEXT,PLAINTEXT:PLAINTEXT \
  -e ALLOW_PLAINTEXT_LISTENER=yes \
  bitnami/kafka:3.5.0


