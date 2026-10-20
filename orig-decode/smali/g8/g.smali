.class public final Lg8/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic a:Lg8/m4;


# direct methods
.method public constructor <init>(Lg8/m4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/g;->a:Lg8/m4;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lg8/g;->a:Lg8/m4;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method
