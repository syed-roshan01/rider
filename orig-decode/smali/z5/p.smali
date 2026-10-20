.class public final Lz5/p;
.super Lz5/s;


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    iput p2, p0, Lz5/p;->e:I

    invoke-direct {p0, p1}, Lz5/q;-><init>([B)V

    sget-object p1, Lz5/s;->d:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lz5/s;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method
