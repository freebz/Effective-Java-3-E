// 원래 코드
while (!stopthread)
    i++;

// 최적화한 코드
if (!stopthread)
    while (true)
	i++;
