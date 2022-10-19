#https://demoqa.com/dynamic-properties adresine gidin
#“Will enable 5 seconds” butonunun enable olmasini bekleyin
#“Will enable 5 seconds” butonunun enable oldugunu test edin
Scenario: explicitly wait
Given kullanici "demoqaUrl" anasayfasinda
Then kullanici Will enable bes seconds butonunun enable olmasini bekler
And kullanici Will enable bes seconds butonunun enable oldugunu test edir