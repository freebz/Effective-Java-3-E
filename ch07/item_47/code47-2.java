// 코드 47-2 스트림을 반복하기 위한 '끔찍한' 우회 방법

for (ProcessHandle ph : (Iterable<ProcessHandle>)
	                ProcessHandle.allProcesses()::iterator){
    // 프로세스를 처리한다.
}
