# これは何か

Pivotalのトレーニングで使ったアプリの拡張エンハンス版です。

## GitHub Actions導入

最初はMySQLをDockerイメージを使ったもので用意しようとしたが、
どうもうまく動かなかった。

参考 https://github.community/t5/GitHub-Actions/github-actions-cannot-connect-to-mysql-service/td-p/30611

結局、用意されているubuntuイメージの中にあるMySQLをそのまま使うことにした。

https://github.com/actions/virtual-environments/blob/master/images/linux/Ubuntu1804-README.md

## Gradleバージョンアップ

Gradleを2020年2月29日（土）時点での最新バージョン（6.2.1）にした。
