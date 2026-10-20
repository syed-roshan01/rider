.class public final Lm0/n;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final a:Lm0/o;


# direct methods
.method public constructor <init>(Lm0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/n;->a:Lm0/o;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lm0/n;->a:Lm0/o;

    invoke-virtual {v0}, Lm0/o;->q()V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lm0/n;->a:Lm0/o;

    invoke-virtual {v0}, Lm0/o;->q()V

    return-void
.end method
