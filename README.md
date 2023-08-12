## | `Java Random Strings Generator`

The most simple random strings generator.
### | `Usage`:
For example let's generate really cool password:
```java
RandomStringsPattern.create()
                .numbers()
                .capitalLetters()
                .letters()
                .symbols()
                .next(30);
```

## | `Add to project:`:
Here is how to add this library depending on your project.
### | `Gradle`:
Repository:
```groovy
maven {
    name = "clojars.org"
    url = uri("https://repo.clojars.org")
}
```
Depend:
```groovy
implementation 'io.github.dynomake:random-strings-generator:1.0.0'
```

### | `Maven`:

Repository:

```xml
<repository>
    <id>clojars.org</id>
    <url>https://repo.clojars.org</url>
</repository>
```

Depend:

```xml

<dependency>
    <groupId>io.github.dynomake</groupId>
    <artifactId>random-strings-generatork</artifactId>
    <version>1.0.0</version>
</dependency>
```

### | `Donations`:
If you want to support my pet-projects and open-source projects, you always can send me crypro to my USDC wallet address on POLYGON network: `0xAE8840E02C52F4a289af083465d78C2329E6ca7B`