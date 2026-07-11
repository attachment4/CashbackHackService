# CashbackHackService

Учебный проект: сервис расчёта остатка до максимального кешбэка и тесты к нему.

## Логика

`CashbackHackService.remain(amount)` возвращает, сколько нужно потратить до следующей
границы кешбэка (кратной 1000).

## Сборка и тесты

```bash
./gradlew test
```

Тесты написаны на **JUnit 4** (`junit:junit:4.13.2`) и запускаются на **JUnit Platform**
через vintage-движок (`org.junit.vintage:junit-vintage-engine`, `useJUnitPlatform()`).

## Ветки

- `main` — основная версия с тестами на JUnit 4.
- `Junit4` — вариант с тестами на JUnit 4.
- `Junit4-platform` — опциональная часть на JUnit Platform (Vintage + Jupiter).

## Известный дефект

`remain(1000)` возвращает `1000` вместо `0` для сумм, кратных 1000.
Тест `shouldReturn0WhenAmount1000` намеренно падает и демонстрирует дефект.
Подробности — в Issues репозитория.

## CI

GitHub Actions (`.github/workflows/gradle.yml`) запускает `./gradlew test`
при каждом `push` и `pull_request`.
