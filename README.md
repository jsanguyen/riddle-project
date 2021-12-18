# riddle-project

jdk 11 and sbt required to run. 

Download and install jdk 11
```
sudo apt-get install openjdk-11-jdk
```

Download and intall scala
```
sudo apt-get install scala
```

Download and install sbt
```
sudo apt-get update
sudo apt-get install apt-transport-https curl gnupg -yqq
echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list
echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo -H gpg --no-default-keyring --keyring gnupg-ring:/etc/apt/trusted.gpg.d/scalasbt-release.gpg --import
sudo chmod 644 /etc/apt/trusted.gpg.d/scalasbt-release.gpg
sudo apt-get update
sudo apt-get install sbt
```
Pull down the project, ```cd /src``` and then ```sbt clean compile``` . Ensure it compiles successfully and run ```sbt run``` to run the main class. 
