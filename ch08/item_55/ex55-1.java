Optional<ProcessHandle> parentProcess = ph.parent();
System.out.println("부모 PID: " + (parentProcess.isPresent() ?
    String.valueOf(parentProcess.get().pid()) : "N/A"));



System.out.println("부모 PID: " +
    ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));



streamOf(Optionals
    .filter(Optional::isPresent)
    .map(Optional::get)



streamOfOptionals
    .flatMap(Optional::stream)
