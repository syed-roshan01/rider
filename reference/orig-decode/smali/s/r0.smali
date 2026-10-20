.class public final Ls/r0;
.super Ljava/lang/Object;


# static fields
.field public static final b:Ls/r0;

.field public static final c:Ls/r0;


# instance fields
.field public final a:Ls/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ls/r0;

    new-instance v7, Ls/b1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x3f

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ls/b1;-><init>(Ls/s0;Ls/w0;ZLjava/util/LinkedHashMap;I)V

    invoke-direct {v0, v7}, Ls/r0;-><init>(Ls/b1;)V

    sput-object v0, Ls/r0;->b:Ls/r0;

    new-instance v0, Ls/r0;

    new-instance v7, Ls/b1;

    const/4 v4, 0x1

    const/16 v6, 0x2f

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ls/b1;-><init>(Ls/s0;Ls/w0;ZLjava/util/LinkedHashMap;I)V

    invoke-direct {v0, v7}, Ls/r0;-><init>(Ls/b1;)V

    sput-object v0, Ls/r0;->c:Ls/r0;

    return-void
.end method

.method public constructor <init>(Ls/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/r0;->a:Ls/b1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ls/r0;

    if-eqz v0, :cond_0

    check-cast p1, Ls/r0;

    iget-object p1, p1, Ls/r0;->a:Ls/b1;

    iget-object v0, p0, Ls/r0;->a:Ls/b1;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 4

    sget-object v0, Ls/r0;->b:Ls/r0;

    invoke-static {p0, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ExitTransition.None"

    goto :goto_1

    :cond_0
    sget-object v0, Ls/r0;->c:Ls/r0;

    invoke-static {p0, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ExitTransition.KeepUntilTransitionsFinished"

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ExitTransition: \nFade - "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ls/r0;->a:Ls/b1;

    iget-object v2, v1, Ls/b1;->a:Ls/s0;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ls/s0;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nSlide - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nShrink - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nScale - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ls/b1;->b:Ls/w0;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ls/w0;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nKeepUntilTransitionsFinished - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, v1, Ls/b1;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ls/r0;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ls/r0;->a:Ls/b1;

    invoke-virtual {v0}, Ls/b1;->hashCode()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ls/r0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
