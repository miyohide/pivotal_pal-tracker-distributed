# これは何か

![](https://github.com/miyohide/pivotal_pal-tracker-distributed/workflows/Java%20CI/badge.svg)

Pivotalのトレーニングで使ったアプリの拡張エンハンス版です。

## GitHub Actions導入

以下の点を修正することでMySQLのDockerイメージを使うことができた。

- アクセス先を`localhost`から`127.0.0.1`に変更
- ポート番号を`3306`から`${{ job.services.mysql.ports['3306'] }}`として環境変数`MY_SQL`を作成。プログラム内で環境変数`MY_SQL`を読み込むようにした
- ユーザを`root`に変更
- パスワードを`root`に設定
- `allowPublicKeyRetrieval=true`をJDBC URLに設定

~~最初はMySQLをDockerイメージを使ったもので用意しようとしたが、
どうもうまく動かなかった。~~

~~参考 https://github.community/t5/GitHub-Actions/github-actions-cannot-connect-to-mysql-service/td-p/30611~~

~~結局、用意されているubuntuイメージの中にあるMySQLをそのまま使うことにした。~~

~~https://github.com/actions/virtual-environments/blob/master/images/linux/Ubuntu1804-README.md~~

## Gradleバージョンアップ

Gradleを2020年2月29日（土）時点での最新バージョン（6.2.1）にした。
