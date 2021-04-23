# Bead3

[![Java CI with Maven](https://github.com/corvinusSajtosMatyas/Bead3/actions/workflows/maven.yml/badge.svg)](https://github.com/corvinusSajtosMatyas/Bead3/actions/workflows/maven.yml)

3. Beadandó

Készítsen egy Spring alkalmazást, amelyben a 6. alkalommal elkészített 
alkalmazáshoz hasonlóan. Az alkalmazás elfogad GET és POST kéréseket.

a) Ha GET kérést kap az alkalmazás,
    akkor üdvözli a felhasználót.

Ha paraméter nélkül hívjuk meg (pl. http://localhost:8081/harmadik), akkor a válasz

```jsx
{"content":"Hello Felhasznalo!"}
```

Ha a name paraméter nem üres (http://localhost:8081/harmadik?name=Bubuka) , akkor pedig a nevén üdvözli a felhasználót

```jsx
{"content":"Hello Bubuka!"}
```

b) Ha POST kérést kap, akkor a text paraméterben megadott értéket megfordítja

Ha nem kap a text paramétert, akkor az "Alma a fa alatt" szöveget írja ki megfordítva.

```jsx
{"content":"ttala af a amlA"}
```

Segítség lehet

- 6. alkalommal elkészült alkalmazás;

- Spring tutorial (https://spring.io/guides/gs/rest-service/#scratch)
