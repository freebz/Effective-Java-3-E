ExecutorSErvice exec = Executors.newSingleThreadExecutor();

exec.execute(runable);

exec.shutdown();
