.class public final Lu/n1;
.super Ljava/lang/Object;

# interfaces
.implements Lb1/f;


# instance fields
.field public final b:Lu/j1;


# direct methods
.method public constructor <init>(Lu/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/n1;->b:Lu/j1;

    return-void
.end method


# virtual methods
.method public final i(Lg1/e;)V
    .locals 1

    iget-object v0, p0, Lu/n1;->b:Lu/j1;

    invoke-interface {v0, p1}, Lu/j1;->c(Lg1/e;)V

    return-void
.end method
