# Artemis

![artemis](./img/artemis.png)

## Artemis Nedir ?

Apache activemq, açık kaynak kodlu bir mesajlaşma servisidir. Farklı uygulamalar ve platformlar arasında veri iletişimde kullanılır.

## Neden Artemis ?

Artemis, queue, pub/sub gibi çeşitli mesajlaşma protokollerini destekler. Bu sayede dağıtılmış uygulamalar arasında veri akışını, iletişimi ve iş akışlarını kolaylaştırır.

- **Esneklik ve Uyumluluk:** Artemiş çeşitki programlama dilleri ile çalışabilen çoklu istemcisi sayesinde farklı teknolojilerin uyumlu bir şekilde çalışmasını sağlar.
- **Yük Dengeleme:** Artemis, mesajları birden çok sunucu içerisinde eşit olarak dağıtır. Bu sayede performans artışı sağlar.
- **Konfigurasyon ve Yönetim:** Artemis sunduğu arayüz ve araçlar sayesinde kolayca yapılandırılıp yönetebilinemktedir.
- **Performans ve Ölçeklenebilirlik:** Artemis yüksek veri akışları ve mesaj trafiğinin etkin bir şekilde yönetebilinmesini sağlar.

Artemis içerisinde bulunan yapılar kısaca şunlardır:

- **Topic:** Mesajların tutulduğu ve birden çok uygulamanın erişebildiği yapıdır.
- **Queue:** FIFO veri yapısı ile çalışan bir modeldir. Sadece bir alıcı işleyebilir ancak işlem sırasına göre alıcılar tarafından tüketilebilir.
- **Broker:** Artemisin genel işleyisini sağlar. Mesajları alır, işler, depolar ve dağıtır.
- **Client:** Broker ile iletişime geçen uygulamalar veya servislerdir.

## Artemis Kurulumu

Spring Boot projesi için gereken depencency

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-artemis</artifactId>
</dependency>
```

Artemis docker kurulumu ve gerekli ayarlamalar için

```docker
docker-compose up
```
