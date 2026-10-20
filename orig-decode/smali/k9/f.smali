.class public final Lk9/f;
.super Ljava/lang/Object;

# interfaces
.implements Lk9/i;


# instance fields
.field public final a:Lk9/i;

.field public final b:Z

.field public final c:Lc9/c;


# direct methods
.method public constructor <init>(Lk9/h;)V
    .locals 1

    sget-object v0, Lk9/n;->a:Lk9/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/f;->a:Lk9/i;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk9/f;->b:Z

    iput-object v0, p0, Lk9/f;->c:Lc9/c;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lk9/e;

    invoke-direct {v0, p0}, Lk9/e;-><init>(Lk9/f;)V

    return-object v0
.end method
