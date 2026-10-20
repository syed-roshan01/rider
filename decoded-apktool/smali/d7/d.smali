.class public final Ld7/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/d;->a:Ljava/lang/Class;

    const-class p1, Ld7/s;

    iput-object p1, p0, Ld7/d;->b:Ljava/lang/Class;

    return-void
.end method
