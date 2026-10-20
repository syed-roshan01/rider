.class public final Lg8/i;
.super Lr7/h;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final e:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Ll/z2;Lg8/x1;Lg8/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lr7/h;-><init>(Ll/z2;Ljava/lang/Runnable;I)V

    iput-object p3, p0, Lg8/i;->e:Ljava/io/Closeable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lg8/i;->e:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method
