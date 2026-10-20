.class public final Lg8/i2;
.super Le8/i;


# instance fields
.field public d:Le8/q0;


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lg8/i2;->d:Le8/q0;

    invoke-static {p1}, Lg8/z;->g(I)Ljava/util/logging/Level;

    move-result-object p1

    sget-object v1, Lg8/b0;->c:Ljava/util/logging/Logger;

    invoke-virtual {v1, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p1, p2}, Lg8/b0;->a(Le8/q0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final varargs b(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lg8/i2;->d:Le8/q0;

    invoke-static {p1}, Lg8/z;->g(I)Ljava/util/logging/Level;

    move-result-object p1

    sget-object v1, Lg8/b0;->c:Ljava/util/logging/Logger;

    invoke-virtual {v1, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, p3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lg8/b0;->a(Le8/q0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
