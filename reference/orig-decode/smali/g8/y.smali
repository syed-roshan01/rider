.class public final Lg8/y;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lg8/c6;

.field public final b:Lg8/s2;

.field public final c:Lg8/s2;

.field public final d:Lg8/s2;


# direct methods
.method public constructor <init>(Lg8/c6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lg8/l;->r()Lg8/s2;

    move-result-object v0

    iput-object v0, p0, Lg8/y;->b:Lg8/s2;

    invoke-static {}, Lg8/l;->r()Lg8/s2;

    move-result-object v0

    iput-object v0, p0, Lg8/y;->c:Lg8/s2;

    invoke-static {}, Lg8/l;->r()Lg8/s2;

    move-result-object v0

    iput-object v0, p0, Lg8/y;->d:Lg8/s2;

    iput-object p1, p0, Lg8/y;->a:Lg8/c6;

    return-void
.end method
