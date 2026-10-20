.class public abstract Ld9/c;
.super Ljava/lang/Object;

# interfaces
.implements Lj9/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient a:Lj9/a;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Ld9/c;->c:Ljava/lang/Class;

    iput-object p3, p0, Ld9/c;->d:Ljava/lang/String;

    iput-object p4, p0, Ld9/c;->e:Ljava/lang/String;

    iput-boolean p5, p0, Ld9/c;->f:Z

    return-void
.end method


# virtual methods
.method public abstract a()Lj9/a;
.end method

.method public final b()Ld9/d;
    .locals 2

    iget-object v0, p0, Ld9/c;->c:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Ld9/c;->f:Z

    if-eqz v1, :cond_1

    sget-object v1, Ld9/v;->a:Ld9/w;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ld9/m;

    invoke-direct {v1, v0}, Ld9/m;-><init>(Ljava/lang/Class;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ld9/v;->a(Ljava/lang/Class;)Ld9/e;

    move-result-object v0

    :goto_0
    return-object v0
.end method
