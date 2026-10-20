.class public abstract Lt9/g;
.super Lm9/x0;


# instance fields
.field public final c:Lt9/b;


# direct methods
.method public constructor <init>(IILjava/lang/String;J)V
    .locals 7

    invoke-direct {p0}, Lm9/z;-><init>()V

    new-instance v6, Lt9/b;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lt9/b;-><init>(IILjava/lang/String;J)V

    iput-object v6, p0, Lt9/g;->c:Lt9/b;

    return-void
.end method


# virtual methods
.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lt9/g;->c:Lt9/b;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1}, Lt9/b;->e(Lt9/b;Ljava/lang/Runnable;ZI)V

    return-void
.end method
