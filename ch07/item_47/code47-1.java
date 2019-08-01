// 코드 47-1 자바 타입 추론의 한계로 컴파일되지 않는다.

for (ProcessHandle ph : ProcessHandle.allProcesses()::iterator) {
    // 프로세스를 처리한다.
}
